/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author penchy
 */
public class UnSortableException extends Exception {
    public UnSortableException()
    {
        this.message = "The array is un-sortable!";
    }
    
    public UnSortableException(String message)
    {
        if(message == null)
        {
            this.message = "The array is un-sortable!";
        }
        else
        {
            this.message = message;
        }
    }
    
    @Override
    public String getMessage()
    {
        return this.message;
    }
    
    private String message;
}
