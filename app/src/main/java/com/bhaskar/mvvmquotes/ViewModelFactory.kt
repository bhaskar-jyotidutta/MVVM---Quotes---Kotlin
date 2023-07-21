package com.bhaskar.mvvmquotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(private val quoteRepository: QuoteRepository) : ViewModelProvider.Factory{

    /*<T : ViewModel> is a generic type declaration, where T is a type parameter that is constrained
     to be a subclass of ViewModel. This allows the function to work with any class that extends ViewModel.*/

    /*The create function takes a single argument modelClass, which is of type Class<T>.
     This argument represents the class of the ViewModel to be instantiated.*/
    override fun <T : ViewModel> create(modelClass : Class<T>) : T{
        return MainViewModel(quoteRepository) as T
    }

}