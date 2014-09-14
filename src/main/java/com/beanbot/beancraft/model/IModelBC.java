package com.beanbot.beancraft.model;

import net.minecraft.client.model.ModelRenderer;

public interface IModelBC
{
    /**
     * Renders all parts of the model
     *
     * @param size - Size of the model (usually 0.0625f)
     */
    public void render(float size);

    /**
     * Rotates the model part in the given directions
     *
     * @param model - part of the model to rotate
     * @param x
     * @param y
     * @param z
     */
    public void setRotation(ModelRenderer model, float x, float y, float z);
}
