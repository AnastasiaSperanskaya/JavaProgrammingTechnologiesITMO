package lab4.ru.billing.stocklist;

class TechnicalItem extends GenericItem implements Cloneable {
    private short warrantyTime; // гарантийный срок (суток)

    public short getWarrantyTime() { return warrantyTime; }
    public void setWarrantyTime(short warrantyTime) { this.warrantyTime = warrantyTime; }

    @Override
    void printAll() {
        super.printAll();
        System.out.printf("warranty time: %d \n", warrantyTime);
    }

    @Override
    public boolean equals(Object o) {
        TechnicalItem item = (TechnicalItem) o;
        return super.equals(item) && (this.warrantyTime == item.warrantyTime);
    }

    @Override
    public Object clone()throws CloneNotSupportedException{
        return (TechnicalItem) super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + ", " + String.valueOf(this.warrantyTime);
    }
}
