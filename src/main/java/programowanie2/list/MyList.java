package programowanie2.list;

public class MyList {

    private ListElement head = null;
    int size;

    public void add(Object value) {
        ListElement listElement = new ListElement(value, null);
        if (head == null) {
            head = listElement;
            return;
        } else {
            ListElement last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(listElement);
        }
    }

    public void add_by_index(int index, Object value) throws Exception {
        if (index < 0 || index == size()) {
            throw new Exception("Invalid index (out of bands).");

            if (index == 0) {
//                add(value);
                return;
            }



        }
    }

    public int size() {
        int size = 0;
        ListElement temp = head;
        while (temp != null) {
            temp = temp.getNext();
            size++;
        }
        return size;
    }

    public void show() {
        int showIndex = 0;
        ListElement temp = head;
        while (temp != null) {
            System.out.println("[" + showIndex + "] = " + temp.getValue());
            temp = temp.getNext();
            showIndex++;
        }
    }

}
