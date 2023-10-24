# Selection Sort Projesi Cevap Belgesi

```Java
[22,27,16,2,18,6] -> Insertion Sort
```
Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

Big-O gösterimini yazınız.
## Cevap
* `o(n^2)`

## Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? 
## Cevap
* Average Case kategorisinde yer alır.
--------------------------------------------------


```Java
[7,3,5,8,2,9,4,15,6] dizisinin Selection Sorta göre ilk 4 adımını yazınız.
```

## Cevap

### Insertion Sort
   ```Java
    [22,27,16,2,18,6] -> Insertion Sort
   ```

* Yukarıda 1.indeks 0.indeks'ten büyük mü? Büyük.
    ```Java
    [22,27,16,2,18,6]
    ```
* Yukarıda 2.indeks 1.indeks'ten büyük mü? Değil. Değiştir
    ```Java
    [22,16,27,2,18,6]
    ```
* Yukarıda 1.indeks 0.indeks'ten büyük mü? Değil. Değiştir
    ```Java
    [16,22,27,2,18,6]
    ```
* Yukarıda sol taraf 3.indeksten büyük olduğu sürece değiş.
    ```Java
    [2,16,22,27,18,6]
    ```
* Yukarıda sol taraf 4.indeksten büyük olduğu sürece değiş.
    ```Java
    [2,16,22,27,18,6]
    ```
* Yukarıda sol taraf 5.indeksten büyük olduğu sürece değiş.
    ```Java
    [2,6,16,18,22,27]
    ```
### Selection Sort
   ```Java
    [7,3,5,8,2,9,4,15,6] Selection Sort
   ```
* Yukarıda en küçük indeks ile 0.indeksteki değer yer değiştirir.
   ```Java
    [2,3,5,8,7,9,4,15,6] Selection Sort
   ```
* Yukarıda 0.indeks haricinde en küçük indeks ile 1.indeksteki değer yer değiştirir.
   ```Java
    [2,3,5,8,7,9,4,15,6] Selection Sort
   ```
* Yukarıda 0 ve 1.indeks haricinde en küçük indeks ile 2.indeksteki değer yer değiştirir.
   ```Java
    [2,3,4,8,7,9,5,15,6] Selection Sort
   ```
* Yukarıda 0, 1 ve 2.indeks haricinde en küçük indeks ile 3.indeksteki değer yer değiştirir.
   ```Java
    [2,3,4,5,7,9,8,15,6] Selection Sort
   ```
