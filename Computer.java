public class Computer {
        private String computerNumber;
        private String lcdModel;
        private int ramSize;
        private int hddSize;
        private boolean hasGPU;

        public Computer(String computerNumber, String lcdModel, int ramSize, int hddSize, boolean hasGPU) {
            this.computerNumber = computerNumber;
            this.lcdModel = lcdModel;
            this.ramSize = ramSize;
            this.hddSize = hddSize;
            this.hasGPU = hasGPU;
        }

        public String getComputerNumber() {
            return this.computerNumber;
        }

        public String getLcdModel() {
            return this.lcdModel;
        }

        public int getRamSize() {
            return this.ramSize;
        }

        public int getHddSize() {
            return this.hddSize;
        }

        public boolean hasGPU() {
            return this.hasGPU;
        }

        public void setComputerNumber(String number) {
            this.computerNumber = number;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Computer) {
                Computer computer = (Computer) obj;
                return this.computerNumber.equals(computer.getComputerNumber());
            }
            return false;
        }

        @Override
        public Computer clone() {
            return new Computer(this.computerNumber, this.lcdModel, this.ramSize, this.hddSize, this.hasGPU);
        }
    }

