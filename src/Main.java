import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<HouseData> dataList = new ArrayList<>();

        String filePath = "house_prices.csv";

        try {

            BufferedReader br =
                    new BufferedReader(new FileReader(filePath));

            String line;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] values = line.split(",");

                double sqft = Double.parseDouble(values[0]);
                int bedrooms = Integer.parseInt(values[1]);
                int bathrooms = Integer.parseInt(values[2]);
                double price = Double.parseDouble(values[3]);

                HouseData house =
                        new HouseData(
                                sqft,
                                bedrooms,
                                bathrooms,
                                price
                        );

                dataList.add(house);
            }

            br.close();

        } catch (Exception e) {

            System.out.println("Error reading CSV file");
            e.printStackTrace();
        }

        // Create model
        LinearRegressionModel model =
                new LinearRegressionModel();

        // Train model
        model.train(dataList);

        // Print coefficients
        model.printCoefficients();

        // Predict price
        double predictedPrice =
                model.predict(2100, 4, 3);

        System.out.println("\n==========================");
        System.out.println("Predicted House Price");
        System.out.println("==========================");

        System.out.println(
                "House: 2100 sqft, 4 bedrooms, 3 bathrooms"
        );

        System.out.println(
                "Predicted Price: $" + predictedPrice
        );
    }
}