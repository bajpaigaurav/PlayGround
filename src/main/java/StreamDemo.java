import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

    static class Demo {
        private int num ;
        private String name ;

        public Demo(int num, String name) {
            this.num = num;
            this.name = name;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Demo{" +
                    "num=" + num +
                    ", name='" + name + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) {
        List<Demo> demo = new ArrayList<>();

        demo.add(new Demo(1,"apple"));
        demo.add(new Demo(2,"apple2"));
        demo.add(new Demo(3,"appl3"));
        demo.add(new Demo(4,"apple4"));
        demo.add(new Demo(5,"apple5"));

        demo.forEach( d -> {
            if(d.getNum() %2 == 0) {
                d.setName("");
            }
        });

        System.out.println(demo);
    }
}
