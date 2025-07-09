package Threads;

    public class Thread04Task {
        private final Object lock = new Object();
        private boolean turnOfFirst = true;

        class NamedPrinter extends Thread {
            private final String name;
            private final boolean isFirst;

            NamedPrinter(String name, boolean isFirst) {
                this.name = name;
                this.isFirst = isFirst;
            }

            @Override
            public void run() {
                while (true) {
                    synchronized (lock) {
                        while (turnOfFirst != isFirst) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.println(name); // печатаем имя

                        // переключаем флаг
                        turnOfFirst = !turnOfFirst;

                        lock.notify(); // будим другого
                    }
                }
            }
        }
    }
