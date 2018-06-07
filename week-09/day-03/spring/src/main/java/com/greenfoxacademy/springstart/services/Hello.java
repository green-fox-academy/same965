package com.greenfoxacademy.springstart.services;

public class Hello {
    private String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag",
            "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Guten Tag", "Gia'sou", "Aloha", "Shalom",
            "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit",
            "Dia dhuit", "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
            "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej", "Sa-wat-dee", "Merhaba", "Selam",
            "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    public Hello() {
    }

    public Hello(String[] hellos) {
        this.hellos = hellos;
    }

    public int randomColor() {
        return (int) (Math.random() * 256);
    }

    public int randomFontSize() {
        return (int) (Math.random() * 100) + 20;
    }

    public int randomHello() {
        return (int) (Math.random() * 50);
    }

    public String oneHello() {
        return hellos[randomHello()];
    }
}
