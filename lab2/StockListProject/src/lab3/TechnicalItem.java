package lab3;

class TechnicalItem extends GenericItem implements Cloneable {
    short warrantyTime; // гарантийный срок (суток)


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
