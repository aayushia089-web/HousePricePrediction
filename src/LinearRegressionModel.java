// ==========================================
// File: LinearRegressionModel.java
// ==========================================

import org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression;

import java.util.List;

public class LinearRegressionModel {

    // Stores regression coefficients
    private double[] coefficients;

    // Method to train the model
    public void train(List<HouseData> dataList) {

        // Output values (House Prices)
        double[] y = new double[dataList.size()];

        // Input values (sqft, bedrooms, bathrooms)
        double[][] x = new double[dataList.size()][3];

        // Fill data into arrays
        for (int i = 0; i < dataList.size(); i++) {

            // Get one house record
            HouseData data = dataList.get(i);

            // Target value
            y[i] = data.price;

            // Feature values
            x[i][0] = data.sqft;
            x[i][1] = data.bedrooms;
            x[i][2] = data.bathrooms;
        }

        // Create regression model
        OLSMultipleLinearRegression regression =
                new OLSMultipleLinearRegression();

        // Feed training data
        regression.newSampleData(y, x);

        // Calculate coefficients
        coefficients = regression.estimateRegressionParameters();
    }

    // Predict house price
    public double predict(double sqft,
                          int bedrooms,
                          int bathrooms) {

        return coefficients[0]
                + (coefficients[1] * sqft)
                + (coefficients[2] * bedrooms)
                + (coefficients[3] * bathrooms);
    }

    // Print coefficients
    public void printCoefficients() {

        System.out.println("\n========== MODEL COEFFICIENTS ==========");

        System.out.println("Intercept: " + coefficients[0]);

        System.out.println(
                "Square Footage Coefficient: "
                        + coefficients[1]
        );

        System.out.println(
                "Bedrooms Coefficient: "
                        + coefficients[2]
        );

        System.out.println(
                "Bathrooms Coefficient: "
                        + coefficients[3]
        );
    }
}
