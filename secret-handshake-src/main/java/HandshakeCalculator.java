import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        String binaryString = Integer.toBinaryString(number);
        int binary = Integer.parseInt(binaryString);
        List<Signal> signals = new ArrayList<>();
        boolean flag = true;
        if (binary > 10000) {
            flag = false;
            binary -= 10000;
        }
        if (binary == 10000) {
            return signals;
        }
        if (binary >= 1000) {
            signals.add(Signal.JUMP);
            binary -= 1000;
        }
        if (binary >= 100) {
            signals.add(Signal.CLOSE_YOUR_EYES);
            binary -= 100;
        }
        if (binary >= 10) {
            signals.add(Signal.DOUBLE_BLINK);
            binary -= 10;
        }
        if (binary == 1) {
            signals.add(Signal.WINK);
        }
        if (flag) {
            Collections.reverse(signals);
        }
        return signals;
    }

}
