
    package Person;

    public class User extends Person {
        private String userName;
        private int password;

        public User(String id,String name,String userName, String password ) {
            super(id, name);
            this.userName = userName;
            this.password = encrypt(password); // hacer metodo set passwor
        }   //-> en mi opinión un usario debe cumplir con ambos requerimientos.

        public User(String id,String name,String userName, int password ) {
            super(id, name);
            this.userName = userName;
            this.password = password;
        }   //-> en mi opinión un usario debe cumplir con ambos requerimientos.



        public String getUserName() {
            return userName;
        }

        public int getPassword() {
            return password;
        }

        public void setPassword(int password) {
            this.password = password;
        }

       private int encrypt (String password){
          return password.hashCode();  //-> esto "encripta"
    }
    }
