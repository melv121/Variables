public class ex10 {
    public static void main(String[] args) {
        // Types primitifs
        byte my42TypeByte = 42;
        short my42TypeShort = 42;
        int my42TypeInt = 42;
        long my42TypeLong = 42L;
        float my42TypeFloat = 42.0f;
        double my42TypeDouble = 42.0;
        boolean my42TypeBoolean = true;
        char my42TypeChar = '4';

        // Types références
        String my42TypeString = "42";
        Integer my42TypeInteger = 42;
        Double my42TypeDoubleObj = 42.0;
        Boolean my42TypeBooleanObj = true;

        // Obtenir les types en String
        String typeByte = ((Object)my42TypeByte).getClass().getSimpleName();
        String typeShort = ((Object)my42TypeShort).getClass().getSimpleName();
        String typeInt = ((Object)my42TypeInt).getClass().getSimpleName();
        String typeLong = ((Object)my42TypeLong).getClass().getSimpleName();
        String typeFloat = ((Object)my42TypeFloat).getClass().getSimpleName();
        String typeDouble = ((Object)my42TypeDouble).getClass().getSimpleName();
        String typeBoolean = ((Object)my42TypeBoolean).getClass().getSimpleName();
        String typeChar = ((Object)my42TypeChar).getClass().getSimpleName();
        String typeString = my42TypeString.getClass().getSimpleName();
        String typeInteger = my42TypeInteger.getClass().getSimpleName();
        String typeDoubleObj = my42TypeDoubleObj.getClass().getSimpleName();
        String typeBooleanObj = my42TypeBooleanObj.getClass().getSimpleName();

        // Affichage des types
        System.out.println("Type de my42TypeByte: " + typeByte);
        System.out.println("Type de my42TypeShort: " + typeShort);
        System.out.println("Type de my42TypeInt: " + typeInt);
        System.out.println("Type de my42TypeLong: " + typeLong);
        System.out.println("Type de my42TypeFloat: " + typeFloat);
        System.out.println("Type de my42TypeDouble: " + typeDouble);
        System.out.println("Type de my42TypeBoolean: " + typeBoolean);
        System.out.println("Type de my42TypeChar: " + typeChar);
        System.out.println("Type de my42TypeString: " + typeString);
        System.out.println("Type de my42TypeInteger: " + typeInteger);
        System.out.println("Type de my42TypeDoubleObj: " + typeDoubleObj);
        System.out.println("Type de my42TypeBooleanObj: " + typeBooleanObj);
    }
}
