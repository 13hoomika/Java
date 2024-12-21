class Bread {
    String brandName;
    double price;
    int noOfSlice;
    String type;

    public Bread() {
        this("Britannia", 119.90); // Calls the parameterized constructor with 2 arguments
        System.out.println("Constructor with no arguments");
    }

    public Bread(String brandName, double price) {
        this(25, "White Bread"); // Calls the parameterized constructor with int and String arguments
        System.out.println("2 args type String and double in parameterized constructor");
        this.brandName = brandName;
        this.price = price;
    }

    public Bread(int noOfSlice, String type) {
        System.out.println("2 args with instance variables of type int and String");
        this.noOfSlice = noOfSlice;
        this.type = type;
    }

    public void getInfo() {
        System.out.println("Brand name: " + brandName);
        System.out.println("Price: " + price);
        System.out.println("Number of slices: " + noOfSlice);
        System.out.println("Type: " + type);
    }

    // public static void main(String[] runner) {
        // Bread bread = new Bread(); // Creating an object of the Bread class
        // bread.fetchObj(); // Fetching and printing the object's properties
    // }
}
