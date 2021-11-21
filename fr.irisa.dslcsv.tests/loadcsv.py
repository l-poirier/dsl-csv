import time

start = time.time()

import pandas as pd

for i in range(10):
    a=pd.read_csv('order_products__train.csv', sep=',')
    a.to_csv('order_products__train_copy.csv', sep=',')

end = time.time()

print(end-start)


