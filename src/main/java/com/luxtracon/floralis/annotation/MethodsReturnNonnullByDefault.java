package com.luxtracon.floralis.annotation;

import java.lang.annotation.ElementType;

import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;

@Nonnull
@TypeQualifierDefault(ElementType.METHOD)

public @interface MethodsReturnNonnullByDefault {}
