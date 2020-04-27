package builder;

public class LunchOrderDemo {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

        LunchOrder lunchOrder = builder.build();

        System.out.print(lunchOrder.getBread());
        System.out.print(lunchOrder.getCondiments());
        System.out.print(lunchOrder.getDressing());
        System.out.print(lunchOrder.getMeat());
    }
}
