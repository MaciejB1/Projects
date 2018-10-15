class Program {
    public static void main(String[] args) throws Exception {
        Product nPro = new Product(-5,5);
        Inventory nInv = new Inventory();

        nInv.append(nPro);
        nInv.inventoryValue();
        nInv.changePrice(1, 50);
        nInv.inventoryValue();
    }
}