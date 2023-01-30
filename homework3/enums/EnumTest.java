package homework.homework3.enums;

public class EnumTest {

    public static void main(String[] args) {

        WorldSides sth = WorldSides.SOUTH;

        System.out.println(sth);
        WorldSides[] values = WorldSides.values();
        for(int i = 0; i < values.length; i++){
            System.out.println(values[i]);
            System.out.println(values[i].ordinal());
            System.out.println(WorldSides.valueOf(WorldSides.SOUTH.name()));
        }
    }
}
