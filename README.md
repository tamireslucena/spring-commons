## CustomSerializer
as classes com prefixo serializer servem para aplicar alguma mudança em um dado, 
por exemplo, tornar um dado de tipo "Date" plausível de conversão para json utilizando ObjectMapper.
necessário incluir a classe que logo acima do atributo com ```@JsonSerialize(using = CustomDateSerializer.class)```

outro exemplo de uso: aplicar trim() nos atributos string, e assim por diante.