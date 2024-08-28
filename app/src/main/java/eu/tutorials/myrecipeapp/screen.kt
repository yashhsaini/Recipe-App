package eu.tutorials.myrecipeapp
//sealed class are used so that only specified or known classes can inherit from it ,basically restricting subtyoes

sealed class Screen(val route:String) {
object RecipeScreen:Screen("recipescreen")
object DetailScreen:Screen("detailscreen")

}