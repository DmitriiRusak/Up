package inner_classes.shadowing;

public class ShadowDemoMain {
    public static void main(String[] args) {


        ShadowOuter shadowOuter = new ShadowOuter();
        ShadowOuter.ShadowInner shadowInner = shadowOuter.new ShadowInner();
        shadowInner.show(23);

    }
}
