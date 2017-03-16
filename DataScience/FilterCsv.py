import pandas as pd
import numpy as np

def filter(filename, col_name):
    df=pd.read_csv(filename)
    df=df.drop(col_name)
    return df

