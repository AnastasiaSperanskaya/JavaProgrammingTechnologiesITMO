class FirstClass {
    String name
    int ID
    double price

    @Override
    String toString() {
        return name + " " + ID + " " + price

    }

    FirstClass() {}

    FirstClass(name, ID, price) {
        this.name = name
        this.ID = ID
        this.price = price
    }

    FirstClass(Binding binding) {
        name = binding.getProperty("name")
        ID = binding.getProperty("ID")
        price = binding.getProperty("price")
    }
}
