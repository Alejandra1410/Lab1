
package Bank;

import Account.Account;
import Cards.Card;
import Factorys.FactoryAccount;
import Factorys.FactoryCard;
import Factorys.FactoryCustomer;
import Factorys.FactoryTransaction;
import Factorys.FactoryUser;
import Person.Customer;
import Person.User;
import Transaction.Transaction;

import java.sql.Date;

public class Bank {

    public void crearCliente(String name, String id, Date dateOfBirth, String phone, String email, String address) {
        FactoryCustomer customerFactory = new FactoryCustomer();
        Customer customer = customerFactory.createCustomer(name, id, dateOfBirth, phone, email, address);
        System.out.println("Se creó un cliente");
    }

    public void crearUsuario(String id, String name, String userName, String password) {
        FactoryUser userFactory = new FactoryUser();
        User user = userFactory.createUser(id, name, userName, password);
        System.out.println("Se creó un usuario");
    }

    public void crearCuenta(String id, double balance, Customer customer, int type) {
        FactoryAccount accountFactory = new FactoryAccount();
        Account account = accountFactory.factory(id, balance, customer, type);
        System.out.println("Se creó una cuenta");
    }

    public void crearTarjeta(String number, double balance, double creditLimit, Account account, boolean active, int type) {
        FactoryCard cardFactory = new FactoryCard();
        Card card = cardFactory.factory(number, balance, creditLimit, account, active, type);
        System.out.println("Se creó una tarjeta");
    }

    public void crearTransaccion(double amount, Account source, Account destination, int type) {
        FactoryTransaction transactionFactory = new FactoryTransaction();
        Transaction transaction = transactionFactory.factory(amount, source, destination, type);
        System.out.println("Se creó una transacción");
    }
}