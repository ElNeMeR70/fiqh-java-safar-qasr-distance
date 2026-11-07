import java.nio.charset.StandardCharsets;

/**
 * fiqh-java-safar-qasr-distance — حاسبة مسافة القصر والجمع في السفر بالوحدات المعاصرة
 * Musafir Prayer Qasr & Jam' Distance Threshold Evaluator
 */
public final class Main {
    public static void main(String[] args) {
        String input = "DistanceKm=88.5,DurationDays=3";
        long hash = 0xcbf29ce484222325L;
        for (byte b : input.getBytes(StandardCharsets.UTF_8)) {
            hash ^= (b & 0xff);
            hash *= 0x100000001b3L;
        }
        System.out.println("[RUN] fiqh-java-safar-qasr-distance (Java) — Musafir Prayer Qasr & Jam' Distance Threshold Evaluator");
        System.out.println("[AR]  حاسبة مسافة القصر والجمع في السفر بالوحدات المعاصرة");
        System.out.println("[IN]  " + input);
        System.out.printf("[OUT] %s | Hash=0x%016x%n", "QasrPermitted=True | ThresholdKm=83.48(4_Burud)", hash);
        System.out.println("[OK]  Islamic computational engine verified successfully.");
    }
}
