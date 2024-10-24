/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purefabrication;

/**
 *
 * @author a
 */
// ConcreteVideo Class (Specific movie implementation)
class ConcreteVideo implements Video {
    private String title;

    public ConcreteVideo(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
