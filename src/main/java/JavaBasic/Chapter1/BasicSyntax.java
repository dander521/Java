package JavaBasic.Chapter1;

class Direction {
    enum DirectionArrow{
        East,
        West,
        North,
        Sourth
    }
    DirectionArrow arrow;
}

public class BasicSyntax {
    public static void main(String[] args) {
        /*
        *   多行注释
        *   多行注释
        */
        System.out.println("Hello World!");
        // 单行注释
        /* 单行注释 */
        Direction direction = new Direction();
        direction.arrow = Direction.DirectionArrow.West;
        System.out.println(direction.arrow);
    }
}
