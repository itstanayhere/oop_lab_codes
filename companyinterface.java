package JAVA.lab_pr;

interface Item
{
    double getTotalSales(); // Method to calculate total sales
    void displayDetails();  // Method to display item details
}
class Hardware implements Item
{
    private String category;
    private String manufacturer;
    private double[] sales; // Array to store sales for 3 months

    public Hardware(String category, String manufacturer, double[] sales)
    {
        this.category = category;
        this.manufacturer = manufacturer;
        this.sales = sales;
    }

    @Override
    public double getTotalSales()
    {
        double total = 0;
        for(double sale : sales)
        {
            total += sale;
        }
        return total;
    }

    @Override
    public void displayDetails()
    {
        System.out.println("Hardware Category: " + category);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Total Sales: $" + getTotalSales());
    }
}
class Software implements Item
{
    private String type;
    private String operatingSystem;
    private double[] sales; // Array to store sales for 3 months

    public Software(String type, String operatingSystem, double[] sales)
    {
        this.type = type;
        this.operatingSystem = operatingSystem;
        this.sales = sales;
    }

    @Override
    public double getTotalSales()
    {
        double total = 0;
        for(double sale : sales)
        {
            total += sale;
        }
        return total;
    }

    @Override
    public void displayDetails()
    {
        System.out.println("Software Type: " + type);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Total Sales: $" + getTotalSales());
    }
}
class companyinterface
{
    public static void main(String[] args)
    {
        // Sales data for 3 months
        double[] hardwareSales = {1500, 2000, 2500};
        double[] softwareSales = {3000, 3200, 3100};

        // Create Hardware and Software objects
        Hardware hardware = new Hardware("Laptop", "Dell", hardwareSales);
        Software software = new Software("Antivirus", "Windows", softwareSales);

        // Display details and total sales
        hardware.displayDetails();
        System.out.println();
        software.displayDetails();
    }
}
