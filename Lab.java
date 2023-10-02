public class Lab {
        private String labID;
        private Computer[] computers;
        private LabStatus status;
        private Employee labAttendant;

        public Lab(String labID, Computer[] computers, LabStatus status, Employee labAttendant) {
            this.labID = labID;
            this.computers = computers;
            this.status = status;
            this.labAttendant = labAttendant;
        }

        public String getLabID() {
            return this.labID;
        }

        public Computer[] getComputers() {
            return this.computers;
        }

        public LabStatus getStatus() {
            return this.status;
        }

        public Employee getLabAttendant() {
            return this.labAttendant;
        }

        public void addComputer(Computer computer) {
            this.computers.add(computer);
        }

        public void removeComputer(String computerNumber) {
            for (int i = 0; i < this.computers.length; i++) {
                if (this.computers[i].getComputerNumber().equals(computerNumber)) {
                    this.computers[i] = null;
                    break;
                }
            }
        }

        public Computer getComputer(String computerNumber) {
            for (Computer computer : this.computers) {
                if (computer.getComputerNumber().equals(computerNumber)) {
                    return computer;
                }
            }
            return null;
        }
    }


