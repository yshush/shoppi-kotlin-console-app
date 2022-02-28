import screen.ShoppingHome

/*
    step 1. main 함수 -> 클래스의 함수
    step 2. 화면별 클래스 분리
    step 3. 선택한 카테고리 상품 목록 표시
    */
fun main(args: Array<String>) {
    val shoppingHome = ShoppingHome()
    shoppingHome.start()
}