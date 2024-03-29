package com.edu.mix.onchange;

public class Product implements Cloneable {

    private String name;

    private boolean canChanged = false;

    public Product(ProductManager manager, String _name) {
        if(manager.isCreateProduct()){
            canChanged =true;
            this.name = _name;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (canChanged) {
            this.name = name;
        }
    }

    @Override
    public Product clone() {
        Product p = null;
        try {
            p = (Product) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }
}
