package zjulzq.github.com.scenario5;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

/**
 * Applying too much direct memory. For example, by using NIO.
 * -Xmx10m -Xms10m
 */
public class Scenario5 {

    public static void main(String[] args)
            throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Unsafe unsafe = getUnsafe();
        long addr = unsafe.allocateMemory(1024 * 1024 * 1024);
        System.out.println(String.format("0x%x", addr));
    }

    public static Unsafe getUnsafe()
            throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        return (Unsafe) field.get(null);
    }
}
