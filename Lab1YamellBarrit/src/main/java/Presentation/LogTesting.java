package Presentation;

import Domain.Client;
import Logic.Log;
import Logic.SavingAccount;
import Logic.CurrentAccount;

public class LogTesting {

    public LogTesting() {
    }

    public void test() {
        Client clients[] = new Client[10];
        Client client1 = new Client("5-0891-0345", "Pamella", "88765892", "Limon, Pacuare");
        Client client2 = new Client("4-0237-0981", "Richard", "70513456", "Limom, Siglo");
        Client client3 = new Client("2-0540-0875", "Jose", "67890123", "Limon, Infiernillo");
        Client client4 = new Client("1-0980-0897", "Tina", "43217585", "Limon, Boston");
        Client client5 = new Client("7-0140-0876", "Trini", "87654321", "Limon, Batan");
        Client client6 = new Client("5-0260-0834", "Maria", "78901234", "Limon, Marchena");
        Client client7 = new Client("6-0320-0897", "Walter", "65435069", "Limon, Villa");
        Client client8 = new Client("2-0670-0819", "Dominick", "85472345", "Limon,Matina");
        Client client9 = new Client("3-0410-0853", "Jean", "56974100", "Limon, Corales III");
        Client client10 = new Client("8-0720-0895", "Anabelle", "74526983", "Limon, Corales II");

        clients[0] = client1;
        clients[1] = client2;
        clients[2] = client3;
        clients[3] = client4;
        clients[4] = client5;
        clients[5] = client6;
        clients[6] = client7;
        clients[7] = client8;
        clients[8] = client9;
        clients[9] = client10;

        SavingAccount account1 = new SavingAccount("2024-09-10", 8, 10, "105560", 20000, client1);
        SavingAccount account2 = new SavingAccount("2024-09-10", 6, 12, "105561", 17000, client2);
        SavingAccount account3 = new SavingAccount("2024-09-10", 20, 15, "105562", 13000, client3);
        SavingAccount account4 = new SavingAccount("2024-09-10", 8, 16, "103563", 20000, client4);
        SavingAccount account5 = new SavingAccount("2024-09-10", 14, 12, "103564", 16000, client5);
        CurrentAccount account6 = new CurrentAccount(15, "103565", 20000, client6);
        CurrentAccount account7 = new CurrentAccount(12, "103561", 17000, client2);
        CurrentAccount account8 = new CurrentAccount(18, "103562", 13000, client3);
        CurrentAccount account9 = new CurrentAccount(12, "103563", 20000, client4);
        CurrentAccount account10 = new CurrentAccount(15, "103564", 18000, client5);

        Log log[] = new Log[10];
        log[0] = new Log(1, "Saving Amount", account1, 5000);
        log[1] = new Log(2, "Saving Amount", account2, 8000);
        log[2] = new Log(3, "Saving Amount", account3, 15000);
        log[3] = new Log(4, "Saving Amount", account4, 13000);
        log[4] = new Log(5, "Saving Amount", account5, 12000);
        log[5] = new Log(6, "Saving Amount", account6, 9000);
        log[6] = new Log(2, "Saving Amount", account7, 8000);
        log[7] = new Log(3, "Saving Amount", account8, 7000);
        log[8] = new Log(4, "Saving Amount", account9, 11000);
        log[9] = new Log(4, "Saving Amount", account10, 8000);

        for (int i = 0; i < log.length; i++) {
            if (log[i] != null) {
                System.out.println(log[0].toString());
                System.out.println(log[1].toString());
                System.out.println(log[2].toString());
                System.out.println(log[3].toString());
                System.out.println(log[4].toString());
                System.out.println(log[5].toString());
                System.out.println(log[6].toString());
                System.out.println(log[7].toString());
                System.out.println(log[8].toString());
                System.out.println(log[9].toString());
            }

        }
    }
}