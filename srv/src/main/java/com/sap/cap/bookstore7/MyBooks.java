package com.sap.cap.bookstore7;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cds.gen.sap.capire.bookstore7.Authors;
import cds.gen.sap.capire.bookstore7.Books;
import cds.gen.sap.capire.products7.Categories;
import cds.gen.sap.capire.products7.ProductsTexts;
import cds.gen.sap.common.Currencies;

public class MyBooks implements Books {

   

    @Override
    public boolean isEmpty() {
        return false;

    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(String key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends String, ? extends Object> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<String> keySet() {
        return null;
    }

    @Override
    public Collection<Object> values() {
        return null;
    }

    @Override
    public Set<Entry<String, Object>> entrySet() {
        return null;
    }

    @Override
    public String toJson() {
        return null;
    }

    @Override
    public Instant getModifiedAt() {
        return null;
    }

    @Override
    public void setModifiedAt(Instant modifiedAt) {

    }

    @Override
    public Authors getAuthor() {
        return null;
    }

    @Override
    public void setAuthor(Map<String, ?> author) {

    }

    @Override
    public ProductsTexts getLocalized() {
        return null;
    }

    @Override
    public void setLocalized(Map<String, ?> localized) {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public String getCurrencyCode() {
        return null;
    }

    @Override
    public void setCurrencyCode(String currencyCode) {

    }

    @Override
    public Instant getCreatedAt() {
        return null;
    }

    @Override
    public void setCreatedAt(Instant createdAt) {

    }

    @Override
    public String getDescr() {
        return null;
    }

    @Override
    public void setDescr(String descr) {

    }

    @Override
    public List<ProductsTexts> getTexts() {
        return null;
    }

    @Override
    public void setTexts(List<? extends Map<String, ?>> texts) {

    }

    @Override
    public Integer getCategoryId() {
        return null;
    }

    @Override
    public void setCategoryId(Integer categoryId) {

    }

    @Override
    public String getCreatedBy() {
        return null;
    }

    @Override
    public void setCreatedBy(String createdBy) {

    }

    @Override
    public BigDecimal getPrice() {
        return null;
    }

    @Override
    public void setPrice(BigDecimal price) {

    }

    @Override
    public String getModifiedBy() {
        return null;
    }

    @Override
    public void setModifiedBy(String modifiedBy) {

    }

    @Override
    public Currencies getCurrency() {
        return null;
    }

    @Override
    public void setCurrency(Map<String, ?> currency) {

    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public void setId(String id) {

    }

    @Override
    public Integer getStock() {
        return null;
    }

    @Override
    public void setStock(Integer stock) {

    }

    @Override
    public Categories getCategory() {
        return null;
    }

    @Override
    public void setCategory(Map<String, ?> category) {

    }

    @Override
    public String getAuthorId() {
        return this.getAuthorId();
    }

    @Override
    public void setAuthorId(String authorId) {
        
    }

    @Override
    public int size() {
        return 0;
    }
     
}