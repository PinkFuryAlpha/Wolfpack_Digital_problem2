public class Main {

    public static void main(String[] args) {

        LinkyList<Integer> myList=new LinkyList<>();

        myList.addElement(2);
        myList.addElement(6);
        myList.addElement(67);
        myList.addElement(420);
        myList.addElement(43);

        myList.showList();
        myList.findMiddle();

    }
}
