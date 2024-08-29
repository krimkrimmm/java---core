package extend_lesson.buoi9.bai1.quanlihodan.entities;

import java.util.ArrayList;
import java.util.List;

public class Family {
        private static int autoId;
        private int id;
        private String numberHouse;
        private List<Member> members;

        public Family(String numberHouse, List<Member> members) {
                this.id = ++autoId;
                this.numberHouse = numberHouse;
                this.members = members;
        }


        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getNumberHouse() {
                return numberHouse;
        }

        public void setNumberHouse(String numberHouse) {
                this.numberHouse = numberHouse;
        }

        public List<Member> getMembers() {
                return members;
        }

        public void setMembers(List<Member> members) {
                this.members = members;
        }

        @Override
        public String toString() {
                return "Family{" +
                        "id=" + id +
                        ", numberHouse='" + numberHouse + '\'' +
                        ", members=" + members +
                        '}';
        }
}