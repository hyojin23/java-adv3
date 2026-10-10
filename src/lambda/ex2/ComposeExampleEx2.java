package lambda.ex2;

public class ComposeExampleEx2 {

    public static MyTransformer compose(MyTransformer f1, MyTransformer f2) {
        return s -> {
            String intermediate = f1.transform(s);
            return f2.transform(intermediate);
        };
    }

    public static void main(String[] args) {
        //f1: 대문자로 변환
        MyTransformer toUpper = new MyTransformer() {
            @Override
            public String transform(String s) {
                return s.toUpperCase();
            }
        };

        //f2: 앞, 뒤에 "**" 붙이기
        MyTransformer addDeco = new MyTransformer() {
            @Override
            public String transform(String s) {
                return "**" + s + "**";
            }
        };

        //합성: f1 -> f2 순서로 적용하는 함수
        MyTransformer composeFunc = compose(toUpper, addDeco);

        //실행
        String result = composeFunc.transform("hello");
        System.out.println(result);
    }
}
