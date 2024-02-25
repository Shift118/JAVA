public class Bank {
	float interest() {
        return 0;
    }
}

public class SBI extends Bank {
    @Override
    float interest() {
        return (float)(8 * 0.01);
    }
}

public class AXIS extends Bank {
    @Override
    float interest() {
        return (float)(7 * 0.01);
    }
}

public class ICICI extends Bank {
    @Override
    float interest() {
        return (float)(9 * 0.01);
    }
}
