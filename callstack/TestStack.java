//example taken from quiz
class Demo {
    public void alpha(int n) {
        if (n>0) {
            beta(n-1);
        }
    }

    public void beta(int n) {
        if (n>0) {
            gamma(n-1);
        }
    }

    public void gamma(int n) {
        if (n>0) {
            gamma(n-1);
        }
    }
}

class TestStack {
    public static void main(String[] args) {
        System.out.println("main called");
        Demo d = new Demo();
        d.alpha(3);
        AnotherClass ac = new AnotherClass();
        System.out.println(ac.a);
    }
}
