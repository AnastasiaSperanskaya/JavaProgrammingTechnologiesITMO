package lab2;

class TechnicalItem extends GenericItem implements Cloneable {
    short warrantyTime; // гарантийный срок (суток)

    public TechnicalItem() {
    }

    public TechnicalItem(String name, float price, GenericItem analogItem, GenericItem.Category category, short warrantyTime) {
        setName(name);
        setPrice(price);
        setAnalog(analogItem);
        setCategory(category);
        this.warrantyTime = warrantyTime;

        setID(lab3.GenericItem.getCurrentID());
        setCurrentID(getCurrentID() + 1);
    }

    public TechnicalItem(TechnicalItem obj) {

        setName(obj.getName());
        setPrice(obj.getPrice());
        setAnalog(obj.getAnalog());
        setCategory(obj.getCategory());

        setID(lab3.GenericItem.getCurrentID());
        setCurrentID(getCurrentID() + 1);
    }

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
