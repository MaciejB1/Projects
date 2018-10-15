class MyExceptions extends Exception {
    void priceCheck(float price) throws Exception {
        if (price <= 0)
            throw new Exception("Invalid price. Price have to be positive number!");
    }

    void quantityCheck(int quantity) throws Exception {
        if (quantity < 0)
            throw new Exception("Invalid quantity!");
    }

}

