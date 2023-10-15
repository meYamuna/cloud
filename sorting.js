function sortDescending(arr) {
    return arr.sort(function(a, b) {
        return b - a;
    });
}

const numbers = [5, 3, 8, 1, 2, 4];
const sortedDescending = sortDescending(numbers);
console.log('Sorted array in descending order:', sortedDescending);