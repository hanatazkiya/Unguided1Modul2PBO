 class Bank {
        private double saldo;
        public Bank(double saldo) {
            this.saldo = saldo;
        }
        public void simpanUang(double jumlah) {
            saldo += jumlah;
        }
        public void ambilUang(double jumlah) {
            if (saldo >= jumlah) {
                saldo -= jumlah;
            } else {
                System.out.println("Saldo tidak mencukupi.");
            }
        }
        public double getSaldo() {
            return saldo;
        }
    }

