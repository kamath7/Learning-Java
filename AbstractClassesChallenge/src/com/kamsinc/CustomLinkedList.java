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
                    currentItem.setNext(item).setPrevious(currentItem);
                    return  true;
                }
            }else if(comparison > 0 ){
                //move left . new item smaller
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(item).setPrevious(currentItem.previous());
                    item.setNext(currentItem).setPrevious(item);
                }else{
                    item.setNext(this.root).setPrevious(item);
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

        if(item!= null) {
            System.out.println("Deleting item " + item.getValue());

        }
        ListItem current = this.root;
        while(current!=null){
            int comparison = current.compareTo(item);
            if (comparison == 0){
                //item to delete found
                if(current == this.root){
                    //delete the root
                    this.root = current.next();
                }else{
                    current.previous().setNext(current.next());

                    if(current.next() !=null){
                        current.next().setPrevious(current.previous());
                    }
                }
                return true;
            }else if(comparison < 0){
                current = current.next();
            }else{
                //past the end point
                return false;
            }
        }

        return false;
    }

    @Override
    public void traverse(ListItem root) {

        if(root == null){
            System.out.println("Root empty");
        }else{
            while(root!= null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
