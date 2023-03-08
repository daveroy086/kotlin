fun twoForty(arr: IntArray, item : Int): Boolean {
    // implement .contains()
    
    var result: Boolean = false
    for(element in arr) {
        if(element == item) result = true
    }
    return result

}
// end twoForty