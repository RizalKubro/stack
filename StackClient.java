
package tugas3;

public class StackClient {
    public static void main(String[] args) {
        Stack st = new Stack(10);

        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next : " + st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");

        int count = st.search("Aku");
        while (count != -1 && count > 1) {
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.empty());
        // System.out.println("Isi stack: ");
        // while (!st.isEmpty()) {
        //     String value = st.pop();
        //     System.out.print(value + " ");
        // }
    }
}
