using DesafioPOO.Models;


System.Console.WriteLine("\nSmartphone Nokia:");
Smartphone nokia = new Nokia(numero: "123456", imei: "111111111", memoria: 64, modelo: "Modelo 1");
nokia.Ligar();
nokia.InstalarAplicativo("WhatApp");

System.Console.WriteLine("---------------------------------------");

System.Console.WriteLine("Smartphone iPhone:");
Smartphone iphone = new Iphone(numero: "7890", imei: "2222222", memoria: 64, modelo: "Modelo 2");
iphone.Ligar();
iphone.InstalarAplicativo("Telegram");