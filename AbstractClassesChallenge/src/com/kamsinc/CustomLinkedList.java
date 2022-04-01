package com.kamsinc;

public class CustomLinkedList implements  NodeList {
    private ListItem root = null;

    public CustomLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root == null){
            this.root = item; //setting head = item
            return true;
        }
        ListItem currentItem = this.root;
        while(currentItem!=null){
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0){
                //move right
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{
                    //insert at end
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return  true;
                }
            }else if(comparison > 0 ){
                //move left . new item smaller
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(item);
                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                }else{
                    item.setNext(this.root);
                    this.root.setPrevious(item);
                    this.root = item;
                }
                return true;
            }else{
                //equal
                System.out.println(item.getValue()+" already present. Avoiding addition");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
