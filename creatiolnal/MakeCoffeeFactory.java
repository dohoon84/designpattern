package creational.factory.method.creational.factory.method1;

public class MakeCoffeeFactory implements CoffeeFactory {
    public MakeCoffeeFactory(String c){
        getCoffee(c);
    }
    @Override
        public Coffee getCoffee(String type) {
            try{
                Class<?> cls = Class.forName("creational.factory.method.creational.factory.method1."+type);
                Object obj = cls.newInstance();
                return (Coffee)obj;
            }catch (Exception e){
                e.printStackTrace();
            }
            return null;
    }
}
