package tewar.demo.domain.recurso.entities;

import co.com.sofka.domain.generic.Entity;
import tewar.demo.domain.recurso.values.CategoryId;

public class Category extends Entity<CategoryId> {
    private final String categoryName;

    public Category(CategoryId entityId, String categoryName) {
        super(entityId);
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
