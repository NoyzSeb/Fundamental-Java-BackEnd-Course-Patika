# Merge Sort Projesi Cevap Belgesi

```Java
[16,21,11,8,12,22] -> Merge Sort
```

1- Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.

2- Big-O gösterimini yazınız.
## Cevap
`o(nlogn)`


## Cevap

### Merge Sort
   ```Java
    [16,21,11,8,12,22] 
   ```
* Diziyi yarıya böleriz.
   ```Java
    [16,21,11] [8,12,22] 
   ```
* Dizileri 2'ye 1 olacak şekilde böleriz.
   ```Java
       A0    A1    B0    B1
    [16,21] [11] [8,12] [22] 
   ```
* A0 İndeksleri karşılaştırılır. Artan sırayla yazılır. A1, A0'ın küçük değerinden daha küçükse sola atılır.
   ```Java
       A01     B0    B1
    [11,16,21] [8,12] [22] 
   ```
* B0 İndeksleri karşılaştırılır. Artan sırayla yazılır. B1, B0'ın büyük değerinden daha büyükse sağa atılır.

   ```Java
       A01        B01
    [11,16,21] [8,12,22] 
   ```
* İki dizinin arasındaki en küçük değer başa yazılır. ve kalanlar karşılaştırılır.
   ```Java
    [8,11,12,16,21,22]
   ```